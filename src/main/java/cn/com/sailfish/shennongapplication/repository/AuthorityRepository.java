package cn.com.sailfish.shennongapplication.repository;

import cn.com.sailfish.shennongapplication.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
