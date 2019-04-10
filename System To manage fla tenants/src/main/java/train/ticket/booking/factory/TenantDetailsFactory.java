package train.ticket.booking.factory;

import train.ticket.booking.domain.TenantDetail;

public class TenantDetailsFactory {
    public static TenantDetail getTenantDetail(String name, String surname,String phoneNum,Long idNum) {
        return new TenantDetail.Builder().name(name).surname(surname)
                .phoneNum(phoneNum).idNum(idNum).build();

    }


}
