# PENGELAN BUILD AUTOMATION

¥ Build Automation adalah proses meng-otomatisasi tahapan pembuatan software dan hal-hal yang berhubungan
dengannya, seperti: kompilasi source code menjadi binary  code, mem-package binary code menjadi distribution
file, membuat dokumentasi, menjalankan automated test sampai manajemen dependency.


¥ Archetype
1. Maven mendukung pembuatan berbagai macam project dengan mudah
2. Pembuatan project di maven menggunakan archetype, archetype adalah template project
3. Kita bisa menggunakan yang sudah disediakan oleh maven, atau bahkan bisa membuat template archetype sendiri

¥ membuat project maven
mvn archetype:generate
maven-archetype-quickstart

# MAVEN PACKAGE
¥ link dowload zip maven
https://maven.apache.org/download.cgi

# MAVEN PROPERTIES
1. Maven mendukung properties untuk menyimpan data konfigurasi
2. Fitur ini akan sangat memudahkan kita kedepannya, dibandingkan melakukan hardcode di konfigurasi maven

# Membuat Distribution File
1. Secara default, maven mendukung pembuatan distribution file menggunakan lifecycle package
2. Hanya saja, hasil distribution file nya berupa file jar yang berisikan binary code dari project kita
3. Dependency lainnya tidak dimasukkan, sehingga tidak bisa langsung dijalankan

¥ Menggunakan Assembly Plugin
1. Salah satu plugin yang bisa kita gunakan untuk membuat distribution file beserta dependency yang kita butuhkan adalah Assembly Plugin
2. https://maven.apache.org/plugins/maven-assembly-plugin/usage.html
3. Tidak hanya Assembly Plugin, sebenarnya masih banyak plugin lain yang bisa kita gunakan untuk membuat distribution file di Maven
4. Untuk membuat distribution file, kita bisa menggunakan perintah mvn package assembly:single


# MULTI MODULE PROJECT

¥ Multi Module Project
1. Saat aplikasi kita sudah sangat besar, kadang ada baiknya kita buat aplikasi dalam bentuk modular
2. Misal kita pisahkan module model, controller, view, service, repository, dan lain-lain
3. Untungnya, Maven mendukung pembuatan project multi module

¥ Membuat Module Baru
1. Untuk membuat module baru, di dalam project yang sudah ada, kita hanya tinggal membuat folder baru, lalu menambahkan setting pom.xml di folder tersebut
2. Module harus memiliki parent, dimana parent nya adalah project diatas folder tersebut
3. Selanjutnya, di parent nya pun, module harus di include

# Membuat Stream
Ada banyak cara untuk membuat Stream di Java
Bisa membuat langsung Stream dari Array, atau dari Collection

¥ Menjalankan Stream
1. Secara default, Stream itu bersifat Cold, artinya data di Stream tidak akan mengalir sampai kita memintanya
2. Ada banyak cara untuk meminta Stream mulai mengalirkan datanya, hal ini akan kita bahas di bagian Stream Operations
3. Untuk saat ini, salah satu method yang bisa kita gunakan agar aliran data di Stream mengalir adalah menggunakan method forEach
4. Stream hanya bisa jalan sekali, mirip seperti aliran data, setelah mengalir, aliran data tidak bisa diulang lagi dari awal

# STREAM BUILDER
1. Kadang kita ingin membuat Stream secara manual, seperti menambah datanya ke Stream secara manual misalnya
2. Java menyediakan Stream Builder untuk membuat Stream secara manual, dan kita bisa menggunakannya seperti Collection, kita bisa membuat Stream Builder, menambahkan data ke Stream Builder, setelah selesai, baru kita buat Stream nya
3. https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/stream/Stream.Builder.html 

# Stream Operation
1. Berbeda dengan Java Collection, di Java Stream hal yang sangat menarik adalah fitur Stream Operations nya
2. Stream Operations adalah kumpulan operasi-operasi yang bisa kita gunakan untuk memanipulasi Stream itu sendiri
3. Ada banyak sekali jenis-jenis Stream Operations yang nanti akan kita bahas satu persatu
4. Namun secara garis besar, Stream Operations tidak akan memodifikasi data aslinya, melainkan hasil dari Stream Operations adalah sebuah Stream baru

# Stream Pipeline
Saat kita membuat Stream, biasanya kita akan melakukan banyak operasi terhadap Stream tersebut
Dan biasanya kita akan membuat Stream Pipeline
Stream Pipeline terdiri dari sebuah sumber stream (bisa array, collection dan lain-lain), lalu diikuti dengan kosong atau lebih stream operations dan diakhiri dengan operasi akhir, misalnya forEach
Saat menggunakan Stream, hampir kebanyakan kita pasti akan membuat sebuah Stream Pipeline

# Lazy Evaluation
1. Stream secara default adalah lazy
2. Dia tidak akan mengalirkan data jika belum menggunakan terminal operation
3. Selain itu, data hanya akan dialirkan seperlunya saja, tergantung terminal operation nya


¥ Intermediate & Terminal Operations
1. Secara garis besar, ada 2 jenis Stream Operation, yaitu Intermediate dan Terminal Operations
2. Intermediate Operations merupakan lazy operation, dimana Stream tidak akan dieksekusi sampai memang dibutuhkan
3. Sedangkan Terminal Operations merupakan operasi yang mentrigger sebuah Stream berjalan
4. Karena Intermediate Operations adalah lazy, maka secara garis besar, semua Intermediate Operations akan mengembalikan Stream lagi

# Transformation Operation
1. Ada banyak Stream Operations di Java Stream, kita akan mulai bahas dari Transformation Operations
2. Transformation Operations adalah operasi yang digunakan untuk mengubah bentuk Stream
3. Ada banyak function yang bisa digunakan untuk mengubah bentuk Stream menjadi sebuah Stream baru, contohnya map dan flatMap

¥ Method
Method                         Keterangan
map(T -> U)                   Mengubah Stream T menjadi Stream U  
flatMap(T -> Stream<U>)       Mengubah Stream T menjadi Stream U

# Filtering Operations
1. Filtering operations adalah operasi di Stream yang digunakan untuk melakukan filter data Stream
2. Contohnya, misal kita punya Stream data dari 1 sampai 10, lalu kita misal hanya ingin menggunakan data yang ganjil atau genap saja

¥ Method Filtering Operations
Method                     Keterangan

filter(U -> Boolean)       Mengambil data yang masuk kriteria filter
distinct()                 Menghapus semua data duplikat

# Retriving Operation
1. Retrieving Operations adalah operasi pada Stream untuk melakukan pengambilan sebagian data
2. Secara garis besar, cara kerjanya hampir mirip dengan Filtering

¥ Method Retrieving Operations
Method                       Keterangan

limit(n)                     Mengambil sejumlah n data
skip(n)                      Menghiraukan sejumlah n data
takeWhile(T -> Boolean)      Mengambil data selama kondisi true
dropWhile(T -> Boolean)      Menghiraukan data selama kondisi true

¥ Retrieving Single Element
1. Stream juga memiliki kemampuan untuk mengambil satu element saja
2. Namun operasi jenis ini merupakan operasi terminal, sehingga akan secara otomatis menjalankan aliran data di Stream

¥ Method Retrieving Single Element

Method                     Keterangan

findAny()                  Mengambil random satu element
findFirst()                Mengambil element pertama


# Aggregate Operations
1. Java Stream mendukung banyak operasi untuk melakukan proses aggregate
2. Seperti menghitung jumlah data, menghitung data max dan menghitung data min.


¥ Method Aggregate Operations
Method                           Keterangan

max(Comparator)                  Mencari data max sesuai comparator
min(Comparator)                  Mencari data min sesuai comparator
count()                          Menghitung total data


# Manual Aggregate Menggunakan Reduce
1. Java Stream juga menyediakan sebuah operasi yang bernama reduce
2. Reduce bisa digunakan untuk melakukan proses aggregate secara manual
3. Misal kita ingin menjumlahkan seluruh angka yang terdapat di Stream, kita bisa melakukan ini menggunakan reduce operator
4. Di bahasa pemrograman lain, reduce mirip seperti operasi fold

# Check Operation
1. Check Operations adalah operasi yang digunakan untuk melakukan pengecekan data di dalam Stream
2. Ada banyak sekali operasi yang bisa digunakan untuk melakukan pengecekan
3. Dan hasil operasi check adalah boolean



Method                        Keterangan

anyMatch(T -> Boolean)        Apakah ada salah satu data yang match dengan kondisi
allMatch(T -> Boolean)        Apakah semua data match dengan kondisi
noneMatch(T -> Boolean)       Apakah semua data tidak match dengan kondisi

# For Each Operations
1. Untuk mengiterasi data satu persatu, sebelumnya kita sudah sering menggunakan operasi forEach
2. Selain forEach, ada juga method untuk melakukan for each, tapi tanpa harus melakukan terminal operation

# Primitive Stream
1. Sebelumnya kita sudah tahu bahwa implementasi Stream di Java adalah java.util.stream.Stream<T>
2. Namun bagaimana jika kita butuh melakukan stream terhadap data primitive seperti int, long atau double?
3. Karena untuk Generic hanya bisa menampung tipe data Object, maka di Java Stream, dibuat implementasi Stream khusus untuk tipe data primitive

Class                             Keterangan

java.util.stream.IntStream        Stream untuk tipe data int
java.util.stream.LongStream       Stream untuk tipe data long
java.util.stream.DoubleStream     Stream untuk tipe data double

¥ Primitive Stream Operations
1. Hampir semua stream operator yang pernah kita bahas, ada juga di primitive stream class
2. Bahkan ada beberapa operator yang lebih sederhana, seperti untuk aggregate, kita tidak perlu menggunakan comparator lagi, bahkan ada operator average() untuk menghitung rata-rata di primitive stream
3. Cara pembuatan primitive stream pun hampir mirip dengan Stream biasa, kita bisa gunakan static method di class nya, misal IntStream.of(...), IntStream.builder(), dan lain-lain

# Collector Operation
1. Stream memiliki sebuah operator bernama collect(Collector), function ini biasanya digunakan untuk meng-collect data Stream dan kita ubah menjadi struktur data yang kita inginkan, biasanya kebanyakan developer menggunakan operator collect() untuk mengubah Stream menjadi Collection
2. Operator collect() membutuhkan parameter Collector, namun biasanya kita jarang sekali membuat implementasi interface Collector, karena terlalu kompleks
3. https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/stream/Collector.html
4. Untungnya Java Stream sudah menyediakan sebuah class helper untuk membuat Collector, bernama Collectors

¥ Collectors
1. Collectors adalah class helper yang bisa digunakan untuk membuat Collector
2. Ini mempermudah kita ketika ingin melakukan operasi collect terhadap sebuah Stream
3. Ada banyak sekali static method yang terdapat di class Collectors, dan nanti kita akan coba bahas beberapa method yang sering digunakan
4. https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/stream/Collectors.html 

¥ Membuat Map dengan Collectors
Selain Collection, Collectors juga bisa digunakan untuk membuat Map dari String
Yang membedakan dengan List atau Set, kita harus tentukan function untuk membentuk Key dan Value nya jika ingin membuat Map
Ada banyak function yang bisa kita gunakan, seperti Collectors.toMap(...), Collectors.toConcurrentMap(...) dan Collectors.toUnmodifiableMap(...)

# Grouping By
1. Collectors juga bisa digunakan untuk melakukan grouping by sebuah Stream
2. Hasil dari grouping by adalah Map<Group, List<Value>>

¥ Partitioning By
Selain grouping by, Collectors juga bisa digunakan untuk partitioning by
Hanya saja hasil dari partitioning by hanyalah 2 buah group boolean (true, false)
Hal ini berarti partitioning by hanya akan menghasilkan Map<Boolean, List<Value>>



