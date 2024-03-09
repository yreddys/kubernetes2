package in.yarraneella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yarraneella.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
