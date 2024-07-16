package de.puxler.TCGManager.repository;

import de.puxler.TCGManager.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
