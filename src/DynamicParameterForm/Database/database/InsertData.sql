INSERT INTO PARAMETER_FORM_DEFINITION(ID,DESCRIPTION)
VALUES ('Form1', 'First Form');
INSERT INTO PARAMETER_FORM_DEFINITION(ID,DESCRIPTION)
VALUES ('Form2', 'Second Form');


INSERT INTO PARAMETER_DEFINITION(ID,DESCRIPTION,DISPLAY_TYPE)
VALUES('OrderId','Order Tracking Number','I');
INSERT INTO PARAMETER_DEFINITION(ID,DESCRIPTION,DISPLAY_TYPE)
VALUES('ShipMethod','Shipping Method','R');
INSERT INTO PARAMETER_DEFINITION(ID,DESCRIPTION,DISPLAY_TYPE)
VALUES('PayMethod','Payment Method','S');
INSERT INTO PARAMETER_DEFINITION(ID,DESCRIPTION,DISPLAY_TYPE)
VALUES('EmailManager','Email Copy to  Manager?','S');

INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('Visa','PayMethod','Visa');
INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('MasterCard','PayMethod','MasterCard');
INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('Amex','PayMethod','American Express');

INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('DHL','ShipMethod','DHL');
INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('FedEx','ShipMethod','Federal Express');
INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('Ground5','ShipMethod','Ground (5-Day)');

INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('Yes','EmailManager','Yes');
INSERT INTO PARAMETER_CHOICES(VALUE,PARAMETER_DEFINITION_ID,DESCRIPTION)
VALUES ('No','EmailManager','No');

INSERT INTO PARAMETER_FORM_ITEM_SET(PARAMETER_FORM_DEFINITION_ID,PARAMETER_DEFINITION_ID)
VALUES ('Form1','OrderId');
INSERT INTO PARAMETER_FORM_ITEM_SET(PARAMETER_FORM_DEFINITION_ID,PARAMETER_DEFINITION_ID)
VALUES ('Form1','ShipMethod');
INSERT INTO PARAMETER_FORM_ITEM_SET(PARAMETER_FORM_DEFINITION_ID,PARAMETER_DEFINITION_ID)
VALUES ('Form1','PayMethod');

INSERT INTO PARAMETER_FORM_ITEM_SET(PARAMETER_FORM_DEFINITION_ID,PARAMETER_DEFINITION_ID)
VALUES ('Form2','OrderId');
INSERT INTO PARAMETER_FORM_ITEM_SET(PARAMETER_FORM_DEFINITION_ID,PARAMETER_DEFINITION_ID)
VALUES ('Form2','EmailManager');

COMMIT;


