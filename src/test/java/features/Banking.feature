Feature: Ziraat Bank Consumer Loan
@register
  Scenario: User successfully completing the Banking Activities.
    Given a web browser is at the Ziraat Bankası home page
    When the user clicks Bireysel->Krediler
    And  the user clicks Tüketici Kredisi
    And  the user clicks Hesaplama Aracı
    And  the user picks Tüketici Kredisi, ürün, tutar, vade
    And  the user cliks Hesapla
    Then Hesap is checked
    When the user picks Konut Kredisi, ürün, tutar, vade
    And  the user cliks Hesapla
    Then Hesap is checked
    When the user picks Taşıt Kredisi, ürün, tutar, vade
    And  the user cliks Hesapla
    Then Hesap is checked
    And  driver close

#1. Anasayfa açılır (https://www.ziraatbank.com.tr/tr) GIVEN
#2. Bireysel -> Krediler tıklanır WHEN
#3. Tüketici Kredisi tıklanır     AND
#4. Hesaplama aracı tıklanır      AND
#5. Tüketici Kredisi, ürün, tutar, vade seçilir AND
#6. Hesapla tıklanır   AND
#7. Hesap kontrol edilir    THEN
#8. Konut Kredisi, ürün, tutar, vade seçilir WHEN
#9. Hesapla tıklanır  AND
#10. Hesap kontrol edilir   THEN
#11. Taşıt Kredisi, ürün, tutar, vade seçilir WHEN
#12. Hesapla tıklanır  AND
#13. Hesap kontrol edilir   THEN