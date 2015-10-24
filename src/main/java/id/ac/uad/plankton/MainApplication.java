package id.ac.uad.plankton;

import java.sql.*;

/**
 * Created by an on 20/10/15.
 */
public class MainApplication {


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/planktonmart", "root", "9");

            System.out.println("Connection is now " + (connection.isClosed() ? "Closed" : "Open"));


            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO member (id_member,name,alamat) VALUES (?,?,?)");
            preparedStatement.setInt(1, 10);
            preparedStatement.setString(2, "Ajat");
            preparedStatement.setString(3, "Indramayu");
            int affectedRow = preparedStatement.executeUpdate();
            System.out.println("Success Execute Update, Row Affected : " + affectedRow);


            PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE member SET alamat=? WHERE  id_member=?");
            preparedStatement1.setString(1, "Banjar");
            preparedStatement1.setInt(2, 7);
            int affectedRow1 = preparedStatement1.executeUpdate();
            System.out.println("Success Execute Update, Row Affected : " + affectedRow1);


            PreparedStatement preparedStatement2 = connection.prepareStatement("DELETE FROM member WHERE id_member =?");
            preparedStatement2.setInt(1, 1);
            int affectedRow2 = preparedStatement2.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow2);

            PreparedStatement preparedStatement3 = connection.prepareStatement("INSERT INTO kategori (id_kategori,kategori_name) VALUES (?,?)");
            preparedStatement3.setInt(1, 5);
            preparedStatement3.setString(2,"alat");
            int affectedRow3 = preparedStatement3.executeUpdate();
            System.out.println("Success Execute Insert, " + affectedRow3);

            PreparedStatement preparedStatement4 = connection.prepareStatement("UPDATE kategori SET kategori_name=? WHERE  id_kategori=?");
            preparedStatement4.setString(1, "alat rumah tangga");
            preparedStatement4.setInt(2, 5);
            int affectedRow4 = preparedStatement4.executeUpdate();
            System.out.println("Success Execute Insert, " + affectedRow4);

            PreparedStatement preparedStatement5 = connection.prepareStatement("DELETE FROM kategori WHERE id_kategori =?");
            preparedStatement5.setInt(1, 4);
            int affectedRow5 = preparedStatement5.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow5);

            PreparedStatement preparedStatement6 = connection.prepareStatement("INSERT INTO produk (id_produk, id_kategori, nama_produk, harga) VALUES (?,?,?,?)");
            preparedStatement6.setInt(1, 002);
            preparedStatement6.setInt(2, 3);
            preparedStatement6.setString(3, "Give");
            preparedStatement6.setInt(4, 3500);
            int affectedRow6 = preparedStatement6.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow6);

            PreparedStatement preparedStatement7 = connection.prepareStatement("UPDATE produk SET nama_produk=? WHERE  id_kategori=?");
            preparedStatement7.setString(1, "Lifeboy");
            preparedStatement7.setInt(2, 3);
            int affectedRow7 = preparedStatement7.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow7);

            PreparedStatement preparedStatement8 = connection.prepareStatement("DELETE FROM produk WHERE id_produk =?");
            preparedStatement8.setInt(1, 3);
            int affectedRow8 = preparedStatement8.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow8);

            PreparedStatement preparedStatement9 = connection.prepareStatement("INSERT INTO penjualan (nota, tanggal, member_id, kasir_id) VALUES (?,?,?,?)");
            preparedStatement9.setString(1, "003abc");
            preparedStatement9.setDate(2, Date.valueOf("2015-10-21"));
            preparedStatement9.setInt(3, 2);
            preparedStatement9.setInt(4, 2);
            int affectedRow9 = preparedStatement9.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow9);

            PreparedStatement preparedStatement10 = connection.prepareStatement("UPDATE penjualan SET nota=? WHERE  id_penjualan=?");
            preparedStatement10.setString(1, "001abc");
            preparedStatement10.setInt(2, 1);
            int affectedRow10 = preparedStatement10.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow10);

            PreparedStatement preparedStatement11 = connection.prepareStatement("DELETE FROM penjualan WHERE id_penjualan =?");
            preparedStatement11.setInt(1, 1);
            int affectedRow11 = preparedStatement11.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow11);

            PreparedStatement preparedStatement12 = connection.prepareStatement("INSERT  INTO detail_penjualan (id_penjualan, id_produk, jumlah_barang, total)  VALUES (?,?,?,?)");
            preparedStatement12.setInt(1, 3);
            preparedStatement12.setInt(2, 1);
            preparedStatement12.setInt(3, 2);
            preparedStatement12.setInt(4, 8000);
            int affectedRow12 = preparedStatement12.executeUpdate();
            System.out.println("Success Execute Delete, " + affectedRow12);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Unknown Exeption : " + e.getMessage());
        }

}
}
