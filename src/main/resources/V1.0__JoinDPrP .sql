SELECT d.id_detail_penjualan,d.jumlah_barang,d.total,p2.id_produk,p.id_penjualan
FROM detail_penjualan d
INNER JOIN penjualan p ON (p.id_penjualan = d.id_penjualan)
INNER JOIN produk p2 ON (p2.id_produk = d.id_produk);