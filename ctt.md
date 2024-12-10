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
