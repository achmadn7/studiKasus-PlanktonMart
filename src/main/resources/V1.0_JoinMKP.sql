
SELECT m.id_member,m.name,k.kasir_id,p.id_penjualan,p.nota,p.tanggal
FROM penjualan p
INNER JOIN member m ON (m.id_member = p.member_id)
INNER JOIN kasir k ON (k.kasir_id = p.kasir_id);