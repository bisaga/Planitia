/**
 * This class is generated by jOOQ
 */
package com.bisaga.planitia.generated;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.epic_id_seq</code>
     */
    public static final Sequence<Long> EPIC_ID_SEQ = new SequenceImpl<Long>("epic_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.story_id_seq</code>
     */
    public static final Sequence<Long> STORY_ID_SEQ = new SequenceImpl<Long>("story_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.task_id_seq</code>
     */
    public static final Sequence<Long> TASK_ID_SEQ = new SequenceImpl<Long>("task_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.task_link_id_seq</code>
     */
    public static final Sequence<Long> TASK_LINK_ID_SEQ = new SequenceImpl<Long>("task_link_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.user_info_id_seq</code>
     */
    public static final Sequence<Long> USER_INFO_ID_SEQ = new SequenceImpl<Long>("user_info_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
