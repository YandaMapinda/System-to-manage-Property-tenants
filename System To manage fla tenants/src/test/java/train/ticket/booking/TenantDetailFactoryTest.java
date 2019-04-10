package train.ticket.booking;

import org.junit.Assert;
import org.junit.Test;
import train.ticket.booking.domain.TenantDetail;
import train.ticket.booking.factory.TenantDetailsFactory;

public class TenantDetailFactoryTest {
    @Test
    public void getTenantDetails() {

        String name = "Ziyanda";
        TenantDetail t = TenantDetailsFactory.getTenantDetail(name);
        System.out.println(t);
        Assert.assertNotNull(t.getSurname());
    }
}
