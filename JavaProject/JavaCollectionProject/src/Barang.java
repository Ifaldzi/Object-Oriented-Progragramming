public class Barang 
{
    private String productName;
    private float priceItem;
    private int quantity;
    private float weight;
    private Status status;
    private ServicePackage servicePackage;
    private City city;

    public String getProductName()
    {
        return this.productName;
    }

    public float getPriceItem()
    {
        return this.priceItem;
    }

    public int getQuantity()
    {
        return this.quantity;
    }
    
    public float getWeight()
    {
        return this.weight;
    }

    public Status getStatus()
    {
        return this.status;
    }

    public ServicePackage getServicePackage()
    {
        return this.servicePackage;
    }

    public City getCity()
    {
        return this.city;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public void setPriceItem(float priceItem)
    {
        this.priceItem = priceItem;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void setServicePackage(ServicePackage servicePackage)
    {
        this.servicePackage = servicePackage;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public String toString()
    {
        float total = getPriceItem()*getQuantity();
        String output = getProductName()+" | "+getPriceItem()+
                         " | " +getQuantity() + " | "+getWeight()+" | "+
                         getCity().getDestination()+
                         " | "+getServicePackage().getService()+" "+ 
                         getServicePackage().getValue()+ " | "+
                         getStatus().getCode()+" "+getStatus().getDescription()
                        +" | "+total;
        return output;
    }
}
