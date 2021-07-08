USE quanlybanhang;
CREATE TABLE quanlybanhang.customer (
	cID		INT NOT NULL PRIMARY KEY,
    cName 	VARCHAR(60) NOT NULL,
    cAge	INT NOT NULL
);

CREATE TABLE quanlybanhang.order (
	oID 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cID		INT NOT NULL,
    oDate 	DATE NOT NULL,
    oTotalPrice	DOUBLE NOT NULL,
    FOREIGN KEY (cID) REFERENCES customer(cID)
);

CREATE TABLE quanlybanhang.product (
	pID 	INT NOT NULL PRIMARY KEY,
	pName 	VARCHAR(60) NOT NULL,
    pPrice 	DOUBLE NOT NULL
);

CREATE TABLE quanlybanhang.order_detail (
	oID 	INT NOT NULL AUTO_INCREMENT,
    pID		INT NOT NULL,
    odQTY	INT NOT NULL,
    FOREIGN KEY (oID) REFERENCES quanlybanhang.order(oID),
    FOREIGN KEY (pID) REFERENCES product(pID)
);

