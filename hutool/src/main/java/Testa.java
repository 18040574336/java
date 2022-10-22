//import cn.hutool.core.util.ArrayUtil;
//import cn.hutool.core.util.NumberUtil;
//import cn.hutool.core.util.ReflectUtil;
//
///**
// * @Author: liangpeng
// * @Date: 2021/5/26 17:40
// */
//public class Testa {
//
//    public static void main(String[] args) {
//        //language=JSON
//        String str ="\t{\n" +
//                "\t\t\"bizSerialNum\": \"6be9a3e2-fee9-44ed-94d1-cb412e6314fb:1\",\n" +
//                "\t\t\"principal\": \"plm\",\n" +
//                "\t\t\"credential\": \"plm\",\n" +
//                "\t\t\"data\": {\n" +
//                "\t\t  \"change\": {\n" +
//                "\t\t\t\"itemId\": \"CN-55052823\",\n" +
//                "\t\t\t\"objectType\": \"Ng5_CNRevision\",\n" +
//                "\t\t\t\"owningUser\": \"qpeengcqadnt (qpeengcqadnt)\",\n" +
//                "\t\t\t\"objectName\": \"XBOM TEST19\",\n" +
//                "\t\t\t\"owningProject\": \"5504220-5504220 MY 22 / CHN / Volvo\",\n" +
//                "\t\t\t\"dateReleased\": \"2021-04-23\",\n" +
//                "\t\t\t\"owningGroup\": \"Product Engineering.Engineering.CQADNT\",\n" +
//                "\t\t\t\"counter\": \"1/1\"\n" +
//                "\t\t  },\n" +
//                "\t\t\t\"bomLine\": [\n" +
//                "\t\t\t\n" +
//                "\t\t\t {\n" +
//                "\t\t\t\"parentId\": \"55041000012\",\n" +
//                "\t\t\t\"parentRevisionId\": \"AA\",\n" +
//                "\t\t\t\"parentObjectType\": \"Ng5_EngPartRevision\",\n" +
//                "\t\t\t\"parentMfk\": \"0\",\n" +
//                "\t\t\t\"childItemId\": \"55041000013\",\n" +
//                "\t\t\t\"childRevisionId\": \"AA\",\n" +
//                "\t\t\t\"childObjectType\": \"Ng5_EngPartRevision\",\n" +
//                "\t\t\t\"objectName\": \"Fastener Kit\",\n" +
//                "\t\t\t\"objectDesc\": \"abc(C346)\",\n" +
//                "\t\t\t\"designRequired\": \"No\",\n" +
//                "\t\t\t\"materialClassification\": \"Metal\",\n" +
//                "\t\t\t\"engineeringWeight\": \"0.0\",\n" +
//                "\t\t\t\"releaseStatusList\": \"Frozen\",\n" +
//                "\t\t\t\"owningUser\": \"qpeengcqadnt (qpeengcqadnt)\",\n" +
//                "\t\t\t\"isColoredPart\": \"No\",\n" +
//                "\t\t\t\"uomTag\": \"each\",\n" +
//                "\t\t\t\"qty\": \"1\",\n" +
//                "\t\t\t\"childMfk\": \"0\",\n" +
//                "\t\t\t\"owningSite\": \"BUR_QTEST11\",\n" +
//                "\t\t\t\"owningGroup\": \"Product Engineering.Engineering.CQADNT\"\n" +
//                "\t\t  },\n" +
//                "\t\t  {\n" +
//                "\t\t\t\"parentId\": \"55041000012\",\n" +
//                "\t\t\t\"parentRevisionId\": \"AA\",\n" +
//                "\t\t\t\"parentObjectType\": \"Ng5_SupportPartRevision\",\n" +
//                "\t\t\t\"parentMfk\": \"0\",\n" +
//                "\t\t\t\"childItemId\": \"55041000013\",\n" +
//                "\t\t\t\"childRevisionId\": \"AA\",\n" +
//                "\t\t\t\"childObjectType\": \"Ng5_EngPartRevision\",\n" +
//                "\t\t\t\"objectName\": \"Fastener Kit\",\n" +
//                "\t\t\t\"objectDesc\": \"abc(C3467)\",\n" +
//                "\t\t\t\"designRequired\": \"No\",\n" +
//                "\t\t\t\"materialClassification\": \"Metal\",\n" +
//                "\t\t\t\"engineeringWeight\": \"0.0\",\n" +
//                "\t\t\t\"releaseStatusList\": \"Frozen\",\n" +
//                "\t\t\t\"owningUser\": \"qpeengcqadnt (qpeengcqadnt)\",\n" +
//                "\t\t\t\"isColoredPart\": \"No\",\n" +
//                "\t\t\t\"uomTag\": \"each\",\n" +
//                "\t\t\t\"qty\": \"1\",\n" +
//                "\t\t\t\"childMfk\": \"0\",\n" +
//                "\t\t\t\"owningSite\": \"BUR_QTEST11\",\n" +
//                "\t\t\t\"owningGroup\": \"Product Engineering.Engineering.CQADNT\"\n" +
//                "\t\t  }\n" +
//                "\t\t\t],\n" +
//                "\t\t  \"solutionItem\": {\n" +
//                "\t\t\t\"itemId\": \"55041000012\",\n" +
//                "\t\t\t\"itemRevisionId\": \"AB\",\n" +
//                "\t\t\t\"objectType\": \"Ng5_EngPartRevision\",\n" +
//                "\t\t\t\"objectName\": \"Switch\",\n" +
//                "\t\t\t\"objectDesc\": \"调节开关\",\n" +
//                "\t\t\t\"designRequired\": \"No\",\n" +
//                "\t\t\t\"materialClassification\": \"Electronic\",\n" +
//                "\t\t\t\"type3c\": \"334556\",\n" +
//                "\t\t\t\"leadProgram\": \"5504220-MY 22 / CHN / Volvo /  / XBOM / X1 / Cockpit / 1st Row\",\n" +
//                "\t\t\t\"engineeringWeight\": \"0.0\",\n" +
//                "\t\t\t\"releaseStatusList\": \"Released\",\n" +
//                "\t\t\t\"owningUser\": \"qpeengcqadnt (qpeengcqadnt)\",\n" +
//                "\t\t\t\"isColoredPart\": \"Yes\",\n" +
//                "\t\t\t\"uomTag\": \"each\",\n" +
//                "\t\t\t\"mfk\": \"0\",\n" +
//                "\t\t\t \"owningSite\": \"BUR_QTEST11\",\n" +
//                "\t\t\t\"owningGroup\": \"Product Engineering.Engineering.CQADNT\",\n" +
//                "\t\t\t\"dateReleased\": \"2021-04-23\",\n" +
//                "\t\t\t\"oemNumber\": [{\n" +
//                "\t\t\t  \"customerPartNumber\": \"299778\",\n" +
//                "\t\t\t  \"customerPartRevision\": \"01\",\n" +
//                "\t\t\t  \"customer\": \"BAIC\",\n" +
//                "\t\t\t  \"customerPartName\": \"调节开关\"\n" +
//                "\t\t\t}],\n" +
//                "\t\t\t\"linkedDrawing\": [{\n" +
//                "\t\t\t  \"drawingId\": \"5505274\",\n" +
//                "\t\t\t  \"drawingRevisionId\": \"AA\",\n" +
//                "\t\t\t  \"drawingType\": \"Ng5_DrawingRevision\",\n" +
//                "\t\t\t  \"drawingMfk\": \"0000\",\n" +
//                "\t\t\t  \"drawingStatusList\": \"Released\",\n" +
//                "\t\t\t  \"drawingDateReleased\": \"2021-04-23\"\n" +
//                "\t\t\t}]\n" +
//                "\t\t  }\n" +
//                "\t\t}\n" +
//                "\t}";
//        String [] arr ={"a","b","c"};
//
//        boolean a = ArrayUtil.contains(arr, null);
//        System.out.println(a);
//    }
//
//}
