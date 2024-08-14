# Selenium Search Functionality Automation

This repository contains an automated test script using Selenium to verify the search functionality of a web page. The script ensures that when a user enters a search term into the search box and clicks the search button, the results area displays the expected outcome.

## Assignment Overview

### Objective

The objective of this assignment was to develop an automated test script that interacts with a web page to validate its search functionality. Specifically, the script needed to:

- Locate and interact with a search input field.
- Enter a search term.
- Click a search button.
- Verify that the results area updates with the expected results.

### Test Details

- **Website**: [https://www.wikipedia.org/]
- **Search Term**: "Selenium"
- **Expected Result**: The results area should display the text "Results for 'Selenium'."

### Steps Taken

1. **Locating the Search Input Field**: 
   - I used Selenium WebDriver to locate the search input field on the webpage using its unique identifier (ID) and successfully implemented the interaction to input a search term.

2. **Entering the Search Term**: 
   - The test script programmatically entered the search term "Selenium" into the search box, simulating a user's action.

3. **Clicking the Search Button**: 
   - After entering the search term, the script located and clicked the search button, which triggers the search functionality of the web page.

4. **Verifying the Results**: 
   - Finally, the script checked the results area to confirm that it displayed the expected outcome: "Results for 'Selenium'." If the expected result was found, the test was considered successful.

### Tools Used

- **Selenium WebDriver**: This was the primary tool used for automating web browser interactions.
- **Java**: The test script was written in Java, leveraging its robust features for automation.
- **TestNG**: I used TestNG for managing the test cases, providing assertions.

### Conclusion

This assignment allowed me to apply my knowledge of Selenium, Java, and TestNG in automated testing to ensure a critical functionality of a web application works as intended. The successful execution of the test script demonstrates the effectiveness of automation in validating web applications.


### Website 

![Screenshot 2024-08-14 173121](https://github.com/user-attachments/assets/9da9f906-4583-4aee-85a9-7ca17483d4d8)

### Expected Outcome

![Screenshot 2024-08-14 172541](https://github.com/user-attachments/assets/4133b903-5bd8-4ed6-be94-96c6b4dc953b)


## Acknowledgments

- Special thanks to resources and documentation related to Selenium WebDriver and TestNG that aided in completing this assignment.
