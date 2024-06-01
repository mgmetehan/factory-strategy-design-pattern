# factory-strategy-design-pattern
? **Java'da If-Else Karmasikligini Strategy ve Factory Pattern ile Azaltmak** ?

Modern yazilim gelistirme sureclerinde, kodun moduler, esnek ve bakiminin kolay olmasi buyuk onem tasir. Bu ornekte Strategy ve Factory Pattern kullanarak nasil daha dinamik ve yonetilebilir hale getirdigimi paylasmak istiyorum.

### Strategy ve Factory Pattern Nedir ve Ne Ise Yarar?
Bu kod parcacigi, farkli bildirim turlerine gore nasil islem yapilacagini belirleyen bir `NotificationFactory` ve `NotificationStrategy` kullaniyor. Bu sayede, if-else veya switch-case yapilarinin karmasikligindan kaciniyoruz ve kodumuzu daha esnek ve moduler hale getiriyoruz.

### Uygulama Yapisi
- `NotificationController`: Gelen bildirim isteklerini alir ve ilgili stratejiye yonlendirir.
- `NotificationDto`: Bildirim verilerini tutan veri transfer nesnesi.
- `NotificationFactory`: Gelen bildirim turune gore uygun stratejiyi secer.
- `NotificationStrategy`: Farkli bildirim turlerini islemek icin ortak bir arayuz sunar.
- `SmsNotificationStrategy` ve `EmailNotificationStrategy`: Belirli bildirim turlerini islemek icin bu stratejiler kullanilir.

### Avantajlar:
- **Daha Temiz ve Moduler Kod**: If-else veya switch-case bloklarini ortadan kaldirir.
- **Kolay Genisletilebilirlik**: Yeni bir bildirim turu eklemek sadece yeni bir strateji sinifi olusturmak kadar basit.
- **Bakim Kolayligi**: Moduler yapi sayesinde hata ayiklama ve kod bakimi daha kolay hale gelir.







