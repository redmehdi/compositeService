package com.red.one.weather;

import com.red.one.weather.dto.Root;

/**
 * Interface for the Information micro-service.
 */
public interface EventClient {
  Root get(final String location, final String endDate);
}
