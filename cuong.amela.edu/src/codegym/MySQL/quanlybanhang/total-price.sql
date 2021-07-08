USE quanlybanhang;

ALTER TABLE quanlybanhang.order_detail
	ADD odQTY INT NOT NULL
		AFTER pID;

INSERT INTO quanlybanhang.customer
VALUES (1, "Minh Quan", 10),
       (2, "Ngoc Oanh", 20),
       (3, "Hong Ha", 50);
       
INSERT INTO quanlybanhang.order
VALUES (1, 1, "2006/3/21", 0),
       (2, 2, "2006/3/23", 0),
       (3, 1, "2006/3/16", 0);

INSERT INTO quanlybanhang.product
VALUES (1, "May giat", 3),
       (2, "Tu lanh", 10),
       (3, "Dieu hoa", 7),
       (4, "Quat", 1),
       (5, "Bep dien", 2);
       
INSERT INTO quanlybanhang.order_detail()
VALUES (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
       (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);
       
SELECT quanlybanhang.order.oID, quanlybanhang.order.oDate, quanlybanhang.order.oTotalPrice
FROM quanlybanhang.order;

SELECT cName as "Name", pName as "Product Name"
FROM customer c, product p, quanlybanhang.order, order_detail od
WHERE c.cID = quanlybanhang.order.cID and quanlybanhang.order.oID = od.oID and quanlybanhang.od.pID = p.pID;

SELECT DISTINCT cName as "Name"
FROM customer c join quanlybanhang.order
WHERE c.cID = quanlybanhang.order.cID;

SELECT p.pID as "Product ID", o.oDate as "Date", (p.pPrice * od.odQTY) as "Total"
FROM product p join quanlybanhang.order o join order_detail od
WHERE od.pID = p.pID and o.oID = od.oID;
