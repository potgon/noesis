package dev.potgon.Noesis.journal.infrastructure;

import dev.potgon.Noesis.journal.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
}
