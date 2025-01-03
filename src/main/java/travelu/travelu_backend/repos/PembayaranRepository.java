package travelu.travelu_backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import travelu.travelu_backend.domain.InvoicePembayaran;
import travelu.travelu_backend.domain.Pembayaran;


public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {

    Pembayaran findFirstByNoInvoice(InvoicePembayaran invoicePembayaran);

    boolean existsByNoInvoiceNoInvoiceIgnoreCase(String noInvoice);

}
