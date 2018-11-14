package com.bitmovin.api.encoding.filters;

import com.bitmovin.api.encoding.filters.enums.InterleaveMode;
import com.bitmovin.api.encoding.filters.enums.VerticalLowPassFilteringMode;

/**
 * Created by jyeh on 11/14/18.
 */
public class InterlaceFilter extends Filter {
    private InterleaveMode mode;
    private VerticalLowPassFilteringMode verticalLowPassFilteringMode;

    public InterleaveMode getInterleaveMode()
    {
        return this.mode;
    }

    public void setInterleaveMode(InterleaveMode mode)
    {
        this.mode = mode;
    }

    public VerticalLowPassFilteringMode getVerticalLowPassFilteringMode()
    {
        return this.verticalLowPassFilteringMode;
    }

    public void setVerticalLowPassFilteringMode(VerticalLowPassFilteringMode verticalLowPassFilteringMode)
    {
        this.verticalLowPassFilteringMode = verticalLowPassFilteringMode;
    }
}