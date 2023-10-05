public class ProductRepository {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeById(int id) {
        if (id < 0) {
           RuntimeException e = new RuntimeException("ID не может быть отрицательным: " + id); //создаем отчет об ошибке обычный класс, id который нам передан
            throw e; //стартовать процесс умирания программы с отчетом
        }
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1];
        int copyToIndex = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public PurchaseItem[] getItems() {
        return items;
    }
}
