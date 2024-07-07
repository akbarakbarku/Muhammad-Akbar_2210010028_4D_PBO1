# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pembelian baju menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pembeli, kode pembeli, dan harga baju, kemudian memberikan output berupa informasi detail dari kode pembeli tersebut seperti merk baju, warna baju, dan ukuran baju.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Baju`, `BajuData`, dan `BajuBeraksi` adalah contoh dari class.

```java
public class Baju {
    ...
}

public class BajuData extends Baju {
    ...
}

public class BajuBeraksi {
    ...
}
2. **Object** adalah instance dari class. Pada kode ini, `baju[i] = new BajuData(nama, kode, harga);` adalah contoh pembuatan object.

    ```java
    baju[i] = new BajuData(nama, kode, harga);
    ```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPembeli`, `kodePembeli`, dan `harga` adalah contoh atribut.

    ```java
    private String namaPembeli;
    private String kodePembeli;
    private int harga;
    ```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Baju` dan `BajuData`.

    ```java
    public Baju(String namaPembeli, String kodePembeli, int harga) {
        this.namaPembeli = namaPembeli;
        this.kodePembeli = kodePembeli;
        this.harga = harga;
    }

    public BajuData(String namaPembeli, String kodePembeli, int harga) {
        super(namaPembeli, kodePembeli, harga);
    }
    ```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPembeli`, `setKodePembeli`, dan `setHarga` adalah contoh method mutator.

    ```java
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setKodePembeli(String kodePembeli) {
        this.kodePembeli = kodePembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    ```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPembeli`, `getKodePembeli`, dan `getHarga` adalah contoh method accessor.

    ```java
    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getKodePembeli() {
        return kodePembeli;
    }

    public int getHarga() {
        return harga;
    }
    ```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPembeli`, `kodePembeli`, dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

    ```java
    private String namaPembeli;
    private String kodePembeli;
    private int harga;
    ```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BajuData` mewarisi `Baju` dengan sintaks `extends`.

    ```java
    public class BajuData extends Baju {
        ...
    }
    ```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `info(String)` di `Baju` merupakan overloading method `info` dan `info` di `BajuData` merupakan override dari method `info` di `Baju`.

    ```java
    public String info(String stok) {
        return info() + "\nStok Baju: " + stok;
    }

    @Override
    public String info() {
        return super.info() +
               "\nMerk Baju: " + getMerkBaju() +
               "\nWarna Baju: " + getWarnaBaju() +
               "\nUkuran Baju: " + getUkuranBaju();
    }
    ```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getMerkBaju`, `getWarnaBaju`, dan `getUkuranBaju`.

    ```java
    public String getMerkBaju() {
        String kodeMerk = getKodePembeli().substring(0, 2);
        switch (kodeMerk) {
            case "01":
                return "LEVI'S";
            case "02":
                return "NIKE";
            case "03":
                return "GUCCI";
            case "04":
                return "CHANEL";
            case "05":
                return "HERMES";
            default:
                return "Merk Lain";
        }
    }

    public String getWarnaBaju() {
        String kodeWarna = getKodePembeli().substring(2, 4);
        switch (kodeWarna) {
            case "01":
                return "Merah";
            case "02":
                return "Kuning";
            case "03":
                return "Hijau";
            case "04":
                return "Biru";
            case "05":
                return "Hitam";
            default:
                return "Warna Lain";
        }
    }

    public String getUkuranBaju() {
        String kodeUkuran = getKodePembeli().substring(4, 6);
        switch (kodeUkuran) {
            case "01":
                return "S";
            case "02":
                return "M";
            case "03":
                return "L";
            case "04":
                return "XL";
            case "05":
                return "XXL";
            default:
                return "Ukuran Lain";
        }
    }
    ```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

    ```java
    for (int i = 0; i < baju.length; i++) {
        ...
    }
    ```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

    ```java
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nama Pembeli: ");
    String nama = scanner.nextLine();

    System.out.println("================");
    System.out.println("Data Pembelian: ");
    System.out.println(data.info());
    ```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BajuData[] baju = new BajuData[2];` adalah contoh penggunaan array.

    ```java
    BajuData[] baju = new BajuData[2];
    ```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

    ```java
    try {
        // code that might throw an exception
    } catch (NumberFormatException e) {
        System.out.println("Terjadi Kesalahan Saat Memasukkan Harga: " + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Terjadi Kesalahan Pada Format Kode Pembeli: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan Umum: " + e.getMessage());
    }
    ```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Akbar
NPM: 2210010028
