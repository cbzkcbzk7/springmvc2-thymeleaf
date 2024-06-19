package hello.itemservice.domain.item;

/**
 * packageName    : hello.itemservice.domain.item
 * fileName       : ItemType
 * author         : Sora
 * date           : 2024-06-19
 * description    : 상품 목록
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-19        Sora       최초 생성
 */
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
