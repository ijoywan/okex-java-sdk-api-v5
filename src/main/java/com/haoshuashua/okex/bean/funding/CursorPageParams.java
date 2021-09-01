package com.haoshuashua.okex.bean.funding;

import lombok.Data;

@Data
public class CursorPageParams {
    /**
     * Request page before (newer) this pagination id.
     * eg: before=2, page number = 1.
     */
    protected int before;
    /**
     * Request page after (older) this pagination id.
     * eg: after=2, page number = 3.
     */
    protected int after;
    /**
     * Number of results per request. Maximum 100. (default 100)
     */
    protected int limit;
}
