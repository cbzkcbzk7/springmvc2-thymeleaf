package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * packageName    : hello.itemservice.domain.item
 * fileName       : DeliveryCode
 * author         : Sora
 * date           : 2024-06-19
 * description    : 배송관련
 *                  - FAST : 빠른 배송
 *                  - NORMAL : 일반 배송
 *                  - SLOW : 느린 배송
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-19        Sora       최초 생성
 */
@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

}
