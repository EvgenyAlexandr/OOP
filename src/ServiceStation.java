public class ServiceStation {

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем \"" + transport.getModelName() + "\"");
            transport.service();
            System.out.println();
        }
    }
}
