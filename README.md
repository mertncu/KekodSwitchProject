##Proje Açıklaması
Bu proje, kullanıcıların bir dizi switch ile etkileşime girmesine ve bu switch'lere bağlı olarak dinamik bir BottomNavigationBar oluşturmalarına olanak tanır. "Ego" adlı bir switch, diğer switch'lerin kullanımını kısıtlar ve BottomNavigationBar'ın görünümünü etkiler. Proje, DataBinding veya ViewBinding kullanımını zorunlu kılar.

##Özellikler
###Switch Ekranı:

Uygulama açıldığında 6 adet switch gösterilir.
"Ego" switch'i varsayılan olarak açıktır ve diğer 5 switch devre dışıdır.
"Ego" switch'i kapalı olduğunda, diğer switch'ler etkinleştirilebilir.

###BottomNavigationBar:
"Ego" switch'i kapalı olduğunda, BottomNavigationBar görünür.
"Ego" switch'i açık olduğunda, BottomNavigationBar gizlenir.

###Dinamizm:
Her açılan switch ile birlikte BottomNavigationBar'a bir icon ve metin eklenir.
Icon’lar hangi sırada açıldıysa o sırada görünür.
BottomNavigationBar, "Ego" switch'i açıkken gösterilmez.
"Ego" switch kapatıldığında, ilk açılan switch ve "Switch'lerin Göründüğü Ana Ekran" BottomNavigationBar'da yer alır.

###Switch Ekleme:
Switch'lerin bulunduğu ana ekran 1. slotta yer alır.
Kullanıcı tarafından açılan 4 switch buttonu BottomNavigationBar'a eklenebilir.
En son açılan switch eklenmez.

###Switch Kapatma:
Switch buttonlar kapatıldığında, ilgili BottomNavigationBar item’ları kaldırılır.

###Detay Ekranları:
BottomNavigationBar’daki her bir item, tıklandığında kendi detay ekranına yönlendirir.
Detay ekranları boş bırakılmamalıdır; uygun içerikle doldurulmuştur.

