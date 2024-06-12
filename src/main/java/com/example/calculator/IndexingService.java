package com.example.calculator;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record IndexingService() {

    // declaring a record
    record Index(int serial, String name, String description) {}

    // declaring a list called indexes of type Index
    // List.of() creates an immutable (unchangeable) list of indexes
    static List<Index> indexes = List.of(
            new Index(1, "Abstract Summary", "A Comprehensive Summary about what " +
                    "the Researchers at Deep Mind have done"),
            new Index(2, "Background Information", "Includes discussion about the " +
                    "challenges faced and their respective solutions"),
            new Index(3, "Coding Background", "A explanation of Bellman's Equation " +
                    "Q-Network & the differentiating loss function"),
            new Index(4, "Related Work", "Work done similar to performing Deep " +
                    "Reinforcement Learning on TD-Gammon"),
            new Index(5, "Deep Reinforcement Learning", "Benefits of Experience Replay"),
            new Index(6, "Experiments & Conclusion", "What experiments were performed " +
                    "a final conclusion")
    );

    public List<Index> getIndex() {
        return indexes;

    }

}
