##載入需要的套件

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
import time

PATH = "C:/Users/wunyu/Documents/chromedriver.exe"
driver_service = Service(executable_path=PATH)
##開啟瀏覽器
driver = webdriver.Chrome(service=driver_service)
driver.maximize_window()
button = driver.find_element(By.CSS_SELECTOR,"label[id='97301341_751278109_label'] span[class='radio-button-display ']")
button.click()
time.sleep(5)
driver.get("hhttps://zh.surveymonkey.com/r/EmployeeHealthCheck")
search = driver.find_element(by=By.XPATH, value = "//input[@id='97301339']")
search.send_keys("HAHA")
search.send_keys(Keys.RETURN)
time.sleep(10)
# search.send_keys(Keys.RETURN)
##driver.get("https://zh.surveymonkey.com/r/EmployeeHealthCheck")
# button = driver.find_elements(By.CLASS_NAME, "radio-button-display ")
# button.click()




driver.quit()



# element = driver.find_elements(By.CLASS_NAME, 'wds-input wds-input--lg qt-input_text text')

# element.send_keys('131105')




# Submit = driver.find_element_by_class_name('btn small next-button survey-page-button user-generated notranslate')
# Submit.click()

# ##driver.close()