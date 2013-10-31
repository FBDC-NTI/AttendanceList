package br.edu.bahiana.attendancelist.mobileapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import br.edu.bahiana.attendancelist.service.GetScholarshipPeriodsResponse;
import br.edu.bahiana.attendancelist.service.ServiceClient;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity which displays a login screen to the user, offering registration as
 * well.
 */
public class LoginActivity extends Activity {
	/**
	 * A dummy authentication store containing known user names and passwords.
	 * TODO: remove after connecting to a real authentication system.
	 */
	private static final String[] DUMMY_CREDENTIALS = new String[] {
			"foo@example.com:hello", "bar@example.com:world" };

	/**
	 * The default email to populate the email field with.
	 */
	public static final String EXTRA_EMAIL = "com.example.android.authenticatordemo.extra.EMAIL";

	/**
	 * Keep track of the login task to ensure we can cancel it if requested.
	 */
	private UserLoginTask mAuthTask = null;

	// Values for email and password at the time of the login attempt.
	private String mEmail;
	private String mPassword;

	// UI references.
	private EditText mEmailView;
	private EditText mPasswordView;
	private View mLoginFormView;
	private View mLoginStatusView;
	private TextView mLoginStatusMessageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);

		// Set up the login form.
		mEmail = getIntent().getStringExtra(EXTRA_EMAIL);
		mEmailView = (EditText) findViewById(R.id.email);
		mEmailView.setText(mEmail);

		mPasswordView = (EditText) findViewById(R.id.password);
		mPasswordView
				.setOnEditorActionListener(new TextView.OnEditorActionListener() {
					@Override
					public boolean onEditorAction(TextView textView, int id,
							KeyEvent keyEvent) {
						if (id == R.id.login || id == EditorInfo.IME_NULL) {
							attemptLogin();
							return true;
						}
						return false;
					}
				});

		mLoginFormView = findViewById(R.id.login_form);
		mLoginStatusView = findViewById(R.id.login_status);
		mLoginStatusMessageView = (TextView) findViewById(R.id.login_status_message);

		findViewById(R.id.sign_in_button).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						attemptLogin();
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	/**
	 * Attempts to sign in or register the account specified by the login form.
	 * If there are form errors (invalid email, missing fields, etc.), the
	 * errors are presented and no actual login attempt is made.
	 */
	public void attemptLogin() {
		if (mAuthTask != null) {
			return;
		}

		// Reset errors.
		mEmailView.setError(null);
		mPasswordView.setError(null);

		// Store values at the time of the login attempt.
		mEmail = mEmailView.getText().toString();
		mPassword = mPasswordView.getText().toString();

		boolean cancel = false;
		View focusView = null;

		// Check for a valid password.
		if (TextUtils.isEmpty(mPassword)) {
			mPasswordView.setError(getString(R.string.error_field_required));
			focusView = mPasswordView;
			cancel = true;
		} else if (mPassword.length() < 4) {
			mPasswordView.setError(getString(R.string.error_invalid_password));
			focusView = mPasswordView;
			cancel = true;
		}

		// Check for a valid email address.
		if (TextUtils.isEmpty(mEmail)) {
			mEmailView.setError(getString(R.string.error_field_required));
			focusView = mEmailView;
			cancel = true;
		} else if (!mEmail.contains("@")) {
			mEmailView.setError(getString(R.string.error_invalid_email));
			focusView = mEmailView;
			cancel = true;
		}

		if (cancel) {
			// There was an error; don't attempt login and focus the first
			// form field with an error.
			focusView.requestFocus();
		} else {
			// Show a progress spinner, and kick off a background task to
			// perform the user login attempt.
			mLoginStatusMessageView.setText(R.string.login_progress_signing_in);
			showProgress(true);
			mAuthTask = new UserLoginTask();
			mAuthTask.execute((Void) null);
		}
	}

	/**
	 * Shows the progress UI and hides the login form.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
	private void showProgress(final boolean show) {
		// On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
		// for very easy animations. If available, use these APIs to fade-in
		// the progress spinner.
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
			int shortAnimTime = getResources().getInteger(
					android.R.integer.config_shortAnimTime);

			mLoginStatusView.setVisibility(View.VISIBLE);
			mLoginStatusView.animate().setDuration(shortAnimTime)
					.alpha(show ? 1 : 0)
					.setListener(new AnimatorListenerAdapter() {
						@Override
						public void onAnimationEnd(Animator animation) {
							mLoginStatusView.setVisibility(show ? View.VISIBLE
									: View.GONE);
						}
					});

			mLoginFormView.setVisibility(View.VISIBLE);
			mLoginFormView.animate().setDuration(shortAnimTime)
					.alpha(show ? 0 : 1)
					.setListener(new AnimatorListenerAdapter() {
						@Override
						public void onAnimationEnd(Animator animation) {
							mLoginFormView.setVisibility(show ? View.GONE
									: View.VISIBLE);
						}
					});
		} else {
			// The ViewPropertyAnimator APIs are not available, so simply show
			// and hide the relevant UI components.
			mLoginStatusView.setVisibility(show ? View.VISIBLE : View.GONE);
			mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
		}
	}

	/**
	 * Represents an asynchronous login/registration task used to authenticate
	 * the user.
	 */
	public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {
		@Override
		protected Boolean doInBackground(Void... params) {
			// TODO: attempt authentication against a network service.			
			String URL = "http://10.71.10.124:8080/br.edu.bahiana.attendancelist.service/services/AttendanceListService";
						
			try {
				String NAMESPACE = "http://service.attendancelist.bahiana.edu.br";
			    URL = "http://10.71.10.124:8080/br.edu.bahiana.attendancelist.service/services/AttendanceListService";
			    String SOAP_ACTION = "AttendanceListService";//portType name="" in wsdl;
			    String METHOD_NAME_Rate = "logIn";
			    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME_Rate);
			    request.addProperty("username", "teste");
			    request.addProperty("password", "teste");

			    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
			            SoapEnvelope.VER11);
			    envelope.setOutputSoapObject(request);
			    HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
			    androidHttpTransport.call(SOAP_ACTION, envelope);
		        SoapObject resultsRequestSOAP = (SoapObject) envelope.bodyIn;
		        String r = resultsRequestSOAP.getProperty("logInReturn").toString();  
				System.out.println(r);
				ServiceClient client = new ServiceClient();
				GetScholarshipPeriodsResponse response = client.getScholarshipPeriods(Long.parseLong(r));
				String teste = "";
//				request = new SoapObject(NAMESPACE, "getScholarshipPeriods");
//				request.addProperty("teacherID",Long.parseLong(r));
//				envelope.setOutputSoapObject(request);
//			    androidHttpTransport = new HttpTransportSE(URL);
//			    androidHttpTransport.call(SOAP_ACTION, envelope);
//		        resultsRequestSOAP = (SoapObject) envelope.bodyIn;
//		        r = resultsRequestSOAP.getProperty("logInReturn").toString();  
				
//				AttendanceListService client = new AttendanceListServiceProxy();
//				client.logIn("user", "user");
//				HttpParams htpp = new BasicHttpParams();
//	             
//	            HttpConnectionParams.setConnectionTimeout(htpp, 3000);
//	            HttpConnectionParams.setSoTimeout(htpp, 5000);
//	            htpp.setParameter("username", "teste");
//	            htpp.setParameter("password", "teste");
//	            
//				HttpClient httpclient = new DefaultHttpClient(htpp);
//				HttpGet httpget = new HttpGet(URL);
//                HttpResponse response = httpclient.execute(httpget);
//                HttpEntity entity = response.getEntity();
//            	String returnValue = "";
//                if (entity != null) {
//
//                    InputStream instream = entity.getContent();
//                    returnValue = convertStreamToString(instream);
//
//                    // Closing the input stream will trigger connection release
//                    instream.close();
//                }
//                System.out.println(returnValue);
				// Simulate network access.
				//Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}

			for (String credential : DUMMY_CREDENTIALS) {
				String[] pieces = credential.split(":");
				if (pieces[0].equals(mEmail)) {
					// Account exists, return true if the password matches.
					return pieces[1].equals(mPassword);
				}
			}

			// TODO: register the new account here.
			return true;
		}
		
		 private String convertStreamToString(InputStream is) {

		        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		        StringBuilder sb = new StringBuilder();

		        String line = null;
		        try {
		            while ((line = reader.readLine()) != null) {
		                sb.append(line + "\n");
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                is.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        return sb.toString();
		    }

		@Override
		protected void onPostExecute(final Boolean success) {
			mAuthTask = null;
			showProgress(false);

			if (success) {
				Intent intent = new Intent(LoginActivity.this, ClasseListActivity.class);
				LoginActivity.this.startActivity(intent);
				finish();
			} else {
				mPasswordView
						.setError(getString(R.string.error_incorrect_password));
				mPasswordView.requestFocus();
			}
		}

		@Override
		protected void onCancelled() {
			mAuthTask = null;
			showProgress(false);
		}
	}
}
