//
//{
//        "bizSerialNum": "000000001",
//        "principal": "plm",
//        "credential": "plm",
//        "data": {
//        "bomLine": [
//        {
//        "parentId": "2305331",
//        "parentRevisionId": "5",
//        "parentObjectType": "Ng5_EngPartRevision",
//        "parentMfk": ",=",
//        "childItemId": "2315603",
//        "childRevisionId": "3",
//        "childObjectType": "Ng5_EngPartRevision",
//        "objectName": "BUTTON,12_7MM,ANGLED_CAP",
//        "objectDesc": "BUTTON,12.7MM,ANGLED_CAP",
//        "designRequired": "Yes",
//        "childMfk":"",
//        "materialClassification": null,
//        "thumbnail": null,
//        "type3c": null,
//        "leadProgram": "101984-MY 10 / TBD / Legacy /  / Legacy / Legacy / TBD / TBD",
//        "designMaterial": "Plastic",
//        "caculatedWeight": "11.6116413401703",
//        "engineeringWeight": "1.0",
//        "releaseStatusList": "Released",
//        "owningUser": "TCMigration (tcmigration)",
//        "owningSite": null,
//        "isColoredPart": "No",
//        "uomTag": "each",
//        "colorCode": null,
//        "oemNumber": "",
//        "qty": "",
//        "linkedSupportDesign": [{
//        "supportId":"aa",
//        "supportRevisionId":"bb",
//        "supportType":"cc",
//        "supportMfk":"dd",
//        "supportStatusList":"ff",
//        "supportDateReleased":"gg"
//        }],
//        "linkedDrawing": [{
//        "drawingId":"aa",
//        "drawingRevisionId":"bb",
//        "draiwngtype":"cc",
//        "drawingMfk":"dd",
//        "drawingStatusList":"ee",
//        "drawingDateReleased":"ff"
//
//        }]
//        }
//        ],
//        "solutionItem": {
//        "itemId": "3572854",
//        "itemRevisionId": "AA",
//        "objectType": "Ng5_EngPartRevision",
//        "objectName": "Seat",
//        "objectDesc": "81700TG7XR210M1_SEAT ASSY L, MID-SEAT FAB BENCH MAN NO HEAT",
//        "designRequired": "No",
//        "materialClassification": null,
//        "thumbnail": null,
//        "type3c": null,
//        "leadProgram": "3430783-MY 19 / AM / Honda Japan - Honda /  / TG7X-8P / Pilot / TBD / All Rows",
//        "designMaterial": null,
//        "caculatedWeight": "9217.99487570738",
//        "engineeringWeight": "0.0",
//        "releaseStatusList": "Released",
//        "owningUser": "Prasad Joshi (ajoship1)",
//        "owningSite": null,
//        "isColoredPart": "No",
//        "uomTag": "each",
//        "colorCode": null,
//        "oemNumber": "",
//        "linkedSupportDesign": [{
//        "supportId":"aa",
//        "supportRevisionId":"bb",
//        "supportType":"cc",
//        "supportMfk":"dd",
//        "supportStatusList":"ff",
//        "supportDateReleased":"gg"
//        }],
//        "linkedDrawing": [{
//        "drawingId":"aa",
//        "drawingRevisionId":"bb",
//        "draiwngtype":"cc",
//        "drawingMfk":"dd",
//        "drawingStatusList":"ee",
//        "drawingDateReleased":"ff"
//
//        }]
//        },
//        "change": {
//        "objectDesc": null,
//        "objectName": "TG7X MID ROW COMPLETE SEAT",
//        "owningUser": "Rohit Chavan (achavar3)",
//        "objectType": "Ng5_DRRevision",
//        "itemId": "DF-3907306",
//        "owningProject": "3430783-3430783 MY 19 / AM / Honda Jap",
//        "dateReleased": "2017-07-20",
//        "sequenceNumber": "1/11"
//        }
//        }
//        }


/*

CREATE SEQUENCE "integration"."seq_inte_plm_bom_interface_id"
        INCREMENT 1
        MINVALUE  1
        MAXVALUE 999999999999999999
        START 1;
        CREATE TABLE "integration"."inte_plm_bom_interface" (
        "inte_plm_bom_interface_id" int8 NOT NULL,
        "bomline_parentid" text,
        "bomline_parentrevisionid" text,
        "bomline_parentobjecttype" text,
        "bomline_parentmfk" text,
        "bomline_childitemid" text,
        "bomline_childrevisionid" text,
        "bomline_childobjecttype" text,
        "bomline_objectname" text,
        "bomline_objectdesc" text,
        "bomline_designrequired" text,
        "bomline_childmfk" text,
        "bomline_materialclassification" text,
        "bomline_thumbnail" text,
        "bomline_type3c" text,
        "bomline_leadprogram" text,
        "bomline_designmaterial" text,
        "bomline_caculatedweight" text,
        "bomline_engineeringweight" text,
        "bomline_releasestatuslist" text,
        "bomline_owninguser" text,
        "bomline_owningsite" text,
        "bomline_iscoloredpart" text,
        "bomline_uomtag" text,
        "bomline_colorcode" text,
        "bomline_coemnumber" text,
        "bomline_qty" text,
        "bomline_linkedsupportdesign" text,
        "bomline_linkeddrawing" text,
        "solutionItem_itemId" text,
        "solutionitem_itemrevisionid" text,
        "solutionitem_objecttype" text,
        "solutionitem_objectname" text,
        "solutionitem_objectdesc" text,
        "solutionitem_designrequired" text,
        "solutionitem_materialclassification" text,
        "solutionitem_thumbnail" text,
        "solutionitem_type3c" text,
        "solutionitem_leadprogram" text,
        "solutionitem_designmaterial" text,
        "solutionitem_caculatedweight" text,
        "solutionitem_engineeringweight" text,
        "solutionitem_releasestatuslist" text,
        "solutionitem_owninguser" text,
        "solutionitem_owningsite" text,
        "solutionitem_iscoloredpart" text,
        "solutionitem_uomtag" text,
        "solutionitem_colorcode" text,
        "solutionitem_oemNumber" text,
        "solutionitem_linkedsupportdesign" text,
        "solutionitem_clinkeddrawing" text,
        "change_objectdesc" text,
        "change_objectname" text,
        "change_owninguser" text,
        "change_objecttype" text,
        "change_itemId" text,
        "change_owningproject" text,
        "change_datereleased" text,
        "change_sequencenumber" text,
        PRIMARY KEY ("inte_plm_bom_interface_id")
        )
        ;
        ALTER SEQUENCE "integration"."seq_inte_plm_bom_interface_id" OWNER TO "postgres";


*/
