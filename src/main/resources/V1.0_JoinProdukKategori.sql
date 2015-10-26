SELECT
  p.nama_produk,p.harga,k.id_kategori
FROM produk p
  INNER JOIN kategori k ON (k.id_kategori = p.id_kategori);