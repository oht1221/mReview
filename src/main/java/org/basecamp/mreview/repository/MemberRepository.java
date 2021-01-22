package org.basecamp.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.basecamp.mreview.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{

}
