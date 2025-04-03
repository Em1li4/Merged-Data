# Merged Data - Country Data Integration

A Java-based application for merging and accessing country-level data.

## Description

This project aims to integrate data from different sources to provide a more comprehensive view of countries.  It specifically combines:

1.  **Enrollment Data:** CSV file containing enrollment statistics.
2.  **CIA World Factbook Data:** Country demographics and geographic information sourced from a CSV export of the CIA World Factbook (`factbook.csv`)
## Features

* **Data Loading:** Methods to efficiently load data from CSV files.
* **Data Merging:** Logic to merge datasets based on country names, handling potential inconsistencies.
* **Country Lookup:** Function to retrieve a `CountryData` object containing combined information (enrollment, area, population, etc.).
* **Data Representation:** Classes (`Country`, `CountryData`) to model country entities and their associated data.


