public abstract class BasePhoneManager
{
    private String phoneBrand ; //Telefon markas
    public String phoneModel ; //Telefon modeli

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }
    public abstract double buyTelephone(int price , double otv);
}
