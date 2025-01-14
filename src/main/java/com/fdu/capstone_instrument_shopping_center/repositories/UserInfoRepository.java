package com.fdu.capstone_instrument_shopping_center.repositories;

import com.fdu.capstone_instrument_shopping_center.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
