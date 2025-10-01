package io.kestra.plugin.serdes;

public enum OnBadLines {

    ERROR, // Raise an exception immediately when a bad line is encountered, stopping the task.

    WARN, // Log a warning and skip the bad line.

    SKIP; // Skip bad lines silently without raising an error or warning.

}
