package finalmission.member.repository;

import finalmission.member.domain.Member;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Optional<Member> findByEmailAndPassword(String email, String password);

    boolean existsByName(String name);
}
