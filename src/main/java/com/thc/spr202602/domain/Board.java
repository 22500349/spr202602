package com.thc.spr202602.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter                     // ← 클래스 위: 4칸 전부 getter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;                // getter만 (setter 없음)

    @Setter
    String title, content, author;   // setter 추가
}