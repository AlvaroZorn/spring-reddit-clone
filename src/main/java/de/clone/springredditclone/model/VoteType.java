package de.clone.springredditclone.model;

import lombok.Getter;


public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    @Getter
    private int direction;

    VoteType(int direction) {
    }

}
