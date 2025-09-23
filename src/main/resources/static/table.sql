-- 게시글
CREATE TABLE post_tbl
(
    post_id INT AUTO_INCREMENT PRIMARY KEY, -- 게시글 고유 식별자
    post_title VARCHAR(50) NOT NULL,
    post_sub_title VARCHAR(50) NOT NULL,
    post_git VARCHAR(255),
    post_thumbnail VARCHAR(255) NOT NULL,
    post_tag VARCHAR(100) NOT NULL CHECK(post_tag IN ('web', 'game', 'ect')),
    post_content TEXT
);
