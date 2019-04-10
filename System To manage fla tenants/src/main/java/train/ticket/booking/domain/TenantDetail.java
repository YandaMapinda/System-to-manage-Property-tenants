package train.ticket.booking.domain;

public class TenantDetail {
    private String name;
    private String surname;
    private String phoneNum;
    private long idNum;
    private TenantDetail(){
    }
    private TenantDetail(Builder builder){
        this.idNum = builder.idNum;
        this.name = builder.name;
        this.surname = builder.surname;
        this.phoneNum = builder.phoneNum;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public long getIdNum() {
        return idNum;
    }
    public static class Builder{
        private String name,surname,phoneNum;
        private long idNum;
        public Builder name(String name) {
            this.name=name;
            return this;
        }

        public Builder surname(String s) {
            this.surname = surname;
            return this;
        }

        public Builder phoneNum(String phoneNum) {
            this.phoneNum=phoneNum;
            return this;
        }

        public Builder idNum(Long idNum) {
            this.idNum=idNum;
            return this;
        }
        public TenantDetail build() {
            return new TenantDetail(this);
        }
        @Override
        public String toString() {
            return "Tenant Details{" +
                    "Name='" + name + '\'' +
                    ", Surname='" + surname + '\'' +
                    ", Phone number='" + phoneNum + '\'' +
                    ", ID number=" + idNum +
                    '}';
        }
    }

}
