import streamlit as st
import joblib

model = joblib.load('emotion_classifier.pkl')

st.title("Tweet Emotion Classifier")
st.write("Paste a tweet and predict the emotion it conveys (like happy, sad, joy, fear, etc).")

tweet = st.text_area("Enter a tweet:")

if st.button("Predict Emotion"):
    if tweet.strip():
        prediction = model.predict([tweet])[0]
        #if prediction comment
        if(prediction == 0):
            st.success(f"sad")
        elif(prediction == 1):
            st.success(f"joy")
        elif(prediction == 2):
            st.success(f"love")
        elif(prediction == 3):
            st.success(f"anger")
        elif(prediction == 4):
            st.success(f"fear")
        st.success(f"*Predicted Emotion:* {prediction}")
    else:
        st.warning("Please enter a tweet.")