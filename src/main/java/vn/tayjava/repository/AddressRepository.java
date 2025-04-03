package vn.tayjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.tayjava.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
