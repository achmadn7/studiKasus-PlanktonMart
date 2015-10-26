
CREATE TABLE kategori (
  id_kategori INT NOT NULL,
  kategori_name VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_kategori)
);


CREATE TABLE produk (
  id_produk INT NOT NULL,
  id_kategori INT NOT NULL,
  nama_produke VARCHAR(50) NOT NULL,
  harga INT NOT NULL,
  PRIMARY KEY (id_produk)
);


CREATE TABLE kasir (
  kasir_id INT NOT NULL,
  name VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (kasir_id)
);


CREATE TABLE member (
  id_member INT NOT NULL,
  name VARCHAR(50) NOT NULL,
  alamat VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_member)
);


CREATE TABLE penjualan (
  id_penjualan INT AUTO_INCREMENT NOT NULL,
  nota VARCHAR(50) NOT NULL,
  tanggal DATE NOT NULL,
  member_id INT NOT NULL,
  kasir_id INT NOT NULL,
  PRIMARY KEY (id_penjualan)
);


CREATE TABLE detail_penjualan (
  id_detail_penjualan INT AUTO_INCREMENT NOT NULL,
  id_penjualan INT NOT NULL,
  id_produk INT NOT NULL,
  jumlah_barang INT NOT NULL,
  total INT NOT NULL,
  PRIMARY KEY (id_detail_penjualan)
);


ALTER TABLE produk ADD CONSTRAINT kategori_produk_fk
FOREIGN KEY (id_kategori)
REFERENCES kategori (id_kategori)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE detail_penjualan ADD CONSTRAINT produk_detailpenjualan_fk
FOREIGN KEY (id_produk)
REFERENCES produk (id_produk)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE penjualan ADD CONSTRAINT kasir_penjualan_fk
FOREIGN KEY (kasir_id)
REFERENCES kasir (kasir_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE penjualan ADD CONSTRAINT member_penjualan_fk
FOREIGN KEY (member_id)
REFERENCES member (id_member)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE detail_penjualan ADD CONSTRAINT penjualan_detail_penjualan_fk
FOREIGN KEY (id_penjualan)
REFERENCES penjualan (id_penjualan)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;