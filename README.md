# Tweet Emotion Classification

A AI/ML project that classifies the emotion that you carry with your tweet

## Dataset

This model trained in training.CSV model from kaggle
## Approach Used

Model:

Used LogisticRegression for classification.

Combined preprocessing and classification using a Pipeline.

Training:

used train_test_split.

Saved the trained model using joblib so it can be used later

Streamlit:

Built a simple web app using Streamlit.

Accepts tweet input and predicts the emotions

##  Dependencies

Bash:

pip install pandas scikit-learn streamlit joblib
