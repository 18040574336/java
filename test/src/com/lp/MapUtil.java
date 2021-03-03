package com.lp;

/*
 * Copyright (c) 2015—2030 GantSoftware.Co.Ltd. All rights reserved.
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * is not allowed to be distributed or copied without the license from
 * GantSoftware.Co.Ltd. Please contact the company for more information.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtil {

    /**
     * 将原Map中key值带有"."号的，构造成为嵌入式的Map对象
     * @param source materialCmpRatio   massProductionTotal MASS_PRODUCTION_TOTAL
     * @return
     */
    public static Map<String, Object>  flatToNest(Map<String, Object> source){

        if(null==source){
            return null;
        }

        HashMap<String, Object>  targetMap = new HashMap<>();


        Set<Map.Entry<String, Object>> sourceEntrySet = source.entrySet();
        for(Map.Entry<String, Object> sourceEntry : sourceEntrySet){
            String sourceKey = sourceEntry.getKey();
            Object sourceValue = sourceEntry.getValue();

            Integer pointIndex = sourceKey.indexOf(".");
            if(pointIndex>0){
                String firstSourceKey = sourceKey.substring(0, pointIndex);
                String secondSourceKey = sourceKey.substring(pointIndex+1);

                putNestedValue(targetMap, firstSourceKey, secondSourceKey, sourceValue);

            }else{
                targetMap.put(sourceKey, sourceValue);
            }
        }

        return targetMap;
    };


    private static void putNestedValue(Map<String, Object> target, String firstKey, String secondKey, Object value){

        Object firstKeyValue = target.get(firstKey);

        if(null==firstKeyValue){
            //如果当前子Map对象尚未创建，则自动创建
            firstKeyValue = new HashMap<String, Object>();
            target.put(firstKey, firstKeyValue);
        }

        if(!(firstKeyValue instanceof Map)){
           // throw new SystemException(I18nMsg.tr("Map对象的嵌套key值")+firstKey+I18nMsg.tr("的类型不是Map"));
        }

        Map<String, Object> firstKeyMap = (Map<String,Object>)firstKeyValue;

        Integer pointIndex = secondKey.indexOf(".");
        if(pointIndex>0){
            String firstSourceKey = secondKey.substring(0, pointIndex);
            String secondSourceKey = secondKey.substring(pointIndex+1);

            putNestedValue(firstKeyMap, firstSourceKey, secondSourceKey, value);

        }else{
            firstKeyMap.put(secondKey, value);
        }
    }


    /**
     * 将嵌入式的子Map对象，展平为一层Map对象，key名称为"."的嵌套
     * @param source
     * @return
     */
    public static Map<String, Object>  nestToFlat(Map<String, Object> source){

        if(null==source){
            return null;
        }

        HashMap<String, Object>  targetMap = new HashMap<>();


        Set<Map.Entry<String, Object>> sourceEntrySet = source.entrySet();

        for(Map.Entry<String, Object> sourceEntry : sourceEntrySet){
            String sourceKey = sourceEntry.getKey();
            Object sourceValue = sourceEntry.getValue();

            if(null==sourceValue || (!(sourceValue instanceof Map))){
                targetMap.put(sourceKey, sourceValue);
            }else {
                putSubMapValue(targetMap, sourceKey, (Map<String,Object>)sourceValue);
            }
        }

        return targetMap;

    };

    private static void putSubMapValue(Map<String, Object> targetMap, String firstKey, Map<String,Object> sourceValueMap){

        Set<Map.Entry<String, Object>> sourceEntrySet = sourceValueMap.entrySet();

        for(Map.Entry<String, Object> sourceEntry : sourceEntrySet){
            String sourceKey = sourceEntry.getKey();
            Object sourceValue = sourceEntry.getValue();

            if(null==sourceValue || (!(sourceValue instanceof Map))){
                targetMap.put(firstKey+"."+sourceKey, sourceValue);
            }else {
                putSubMapValue(targetMap, firstKey+"."+sourceKey, (Map<String,Object>)sourceValue);
            }
        }

    }

    public static void main(String[] args) {

        HashMap<String, Object> sourceMap = new HashMap<>();
        sourceMap.put("name", "zhangsan");
        sourceMap.put("address.home", "no.1");
        sourceMap.put("address.company", "no.2");
        sourceMap.put("parent.card.home", "no.3");
        sourceMap.put("parent.card.company", "no.4");
        sourceMap.put("parent.age", "45");


        Map<String, Object> nestMap = MapUtil.flatToNest(sourceMap);
        System.out.println(nestMap);

        Map<String, Object> flatMap = MapUtil.nestToFlat(nestMap);
        System.out.println(flatMap);
    }
}
