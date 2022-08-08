# 0805_回家作業＿
* 賣家可藉由此管理賣場的商品，進行全部商品的查看，或進行商品價格/庫存/介紹的修改，以及上架/下架商品
##  Model
* private String name;
* private int price;
* public int stock;
* private String description;

## Service
*  public List<Shop> getAllShops(){...} </br>
-> 賣家可以取得賣場所有的商品資料(GET)
* public Shop getShopByName(String name){...}  </br>
-> 透過商品名稱來取得目標資料(GET)
* public Shop createShop(Shop shop){...}  </br>
-> 新上架商品(POST)
* public Shop updateShop(String name, Shop shop){...}  </br>
-> 透過名稱對指定的商品進行資料的修改及更新(PUT)
* public Shop deleteShop(String name){...}  </br>
-> 刪除賣場上的商品(DELETE)
