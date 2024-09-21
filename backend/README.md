# Kütüphane Yönetim Sistemi

Kütüphaneler tarafından kullanılabilecek kayıt yönetimlerini, kitap ödünç verme ve alma işlemlerini yapabilecekleri Rest API projesidir.


## Özellikler

- Yazar, kategori, yayınevi ekleme, güncelleme, silme işlemleri yapılır.
- Kitapların stok bilgileri tutulur.
- Kitapların ödünç verme ve geri alma kayıtları tutulur.

## Ekran Görüntüleri
- UML diyagram
  <img src="src/main/resources/images/uml.png" alt="Diagram_1" width="" />

## API Kullanımı
Aşağıda, API'nin sunduğu temel endpoint'lerin bir listesi bulunmaktadır:


| Endpoint                   | HTTP Metodu | Açıklama                                            |
|----------------------------|:------------|-----------------------------------------------------|
| **author**                 |             |                                                     |
| `/api/v1/authors/{id}`     | GET         | Belirtilen ID'ye sahip yazarı getirir               |
| `/api/v1/authors/{id}`     | PUT         | Belirtilen ID'ye sahip yazarı günceller             |
| `/api/v1/authors/{id}`     | DELETE      | Belirtilen ID'ye sahip yazarı siler                 |
| `/api/v1/authors`          | GET         | Tüm yazarları getirir                               |
| `/api/v1/authors`          | POST        | Yazar ekler                                         |
|                            |             |                                                     |
| **publisher**              |             |                                                     |
| `/api/v1/publishers/{id}`  | GET         | Belirtilen ID'ye sahip yayınevini getirir           |
| `/api/v1/publisher/{id}`   | PUT         | Belirtilen ID'ye sahip yayınevini günceller         |
| `/api/v1/publisher/{id}`   | DELETE      | Belirtilen ID'ye sahip yayınevini siler             |
| `/api/v1/publisher`        | GET         | Tüm yayınevlerini getirir                           |
| `/api/v1/publisher`        | POST        | Yayınevi ekler                                      |
|                            |             |                                                     |
| **category**               |             |                                                     |
| `/api/v1/categories/{id}`  | GET         | Belirtilen ID'ye sahip kategoriyi getirir           |
| `/api/v1/categories/{id}`  | PUT         | Belirtilen ID'ye sahip kategoriyi günceller         |
| `/api/v1/categories/{id}`  | DELETE      | Belirtilen ID'ye sahip kategoriyi siler             |
| `/api/v1/categories`       | GET         | Tüm kategorileri getirir                            |
| `/api/v1/categories`       | POST        | Kategori ekler                                      |
|                            |             |                                                     |
| **book**                   |             |                                                     |
| `/api/v1/books/{id}`       | GET         | Belirtilen ID'ye sahip kitabı getirir               |
| `/api/v1/books/{id}`       | PUT         | Belirtilen ID'ye sahip kitabı günceller             |
| `/api/v1/books/{id}`       | DELETE      | Belirtilen ID'ye sahip kitabı siler                 |
| `/api/v1/books`            | GET         | Tüm kitapları getirir                               |
| `/api/v1/books`            | POST        | Kitap ekler                                         |
|                            |             |                                                     |
| **book borrowing**         |             |                                                     |
| `/api/v1/borrows/{id}`     | GET         | Belirtilen ID'ye sahip kitap ödünç almayı getirir   |
| `/api/v1/borrows/{id}`     | PUT         | Belirtilen ID'ye sahip kitap ödünç almayı günceller |
| `/api/v1/borrows/{id}`     | DELETE      | Belirtilen ID'ye sahip kitap ödünç almayı siler     |
| `/api/v1/borrows`          | GET         | Tüm kitap ödünç almaları getirir                    |
| `/api/v1/borrows`          | POST        | kitap ödünç alma ekler                              |


## Kurulum
<<<<<<< HEAD

1. `src/main/resources/application.properties` dosyasında veri tabanı konfigürasyonunu yapın.
2. Projeyi ayağa kaldırmak için idenizden start edin.
3. Swagger üzerinden api kullanılabilir. Tarayıcınızdan http://localhost:8080/swagger-ui/index.html#/ url'ine gidin.
4. End pointlere istek atabilirsiniz.


=======
1. `src/main/resources/application.properties` dosyasında veri tabanı konfigürasyonunu yapın.
2. Projeyi ayağa kaldırmak için idenizden start edin.
3. Swagger üzerinden api kullanılabilir. Tarayıcınızdan http://localhost:8080/swagger-ui/index.html#/ url'ine gidin.
4. End pointlere istek atabilirsiniz.


## Lisans

[MIT](https://choosealicense.com/licenses/mit/)
>>>>>>> 5ef6108ba7db31c0007fb75be5c3701aa8678af8

