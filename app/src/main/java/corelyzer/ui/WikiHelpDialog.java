package corelyzer.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

public class WikiHelpDialog extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7894145534777184347L;

	public static void main(final String[] args) {
		WikiHelpDialog dialog = new WikiHelpDialog(new JFrame(), "");
		dialog.pack();
		dialog.setVisible(true);
		// System.exit(0);
	}

	private JPanel contentPane;
	private JButton buttonClose;
	private JEditorPane helpEditorPane;
	private JTextField wikiWordTextField;
	private JButton searchButton;

	private JButton wikiHelpButton;

	final static String DEFAULT_WIKI_WORD = "PleaseEnterWikiWordHere";

	{
		// GUI initializer generated by IntelliJ IDEA GUI Designer
		// >>> IMPORTANT!! <<<
		// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$();
	}

	public WikiHelpDialog(final Frame owner) {
		super(owner);
		initUIs(owner);
	}

	public WikiHelpDialog(final Frame owner, String wikiWord) {
		this(owner);

		if ((wikiWord == null) || wikiWord.equals("")) {
			wikiWord = DEFAULT_WIKI_WORD;
		}

		wikiWordTextField.setText(wikiWord);
		onSearch();
	}

	public WikiHelpDialog(final JDialog owner) {
		super(owner);
		initUIs(owner);
	}

	public WikiHelpDialog(final JDialog owner, String wikiWord) {
		this(owner);

		if ((wikiWord == null) || wikiWord.equals("")) {
			wikiWord = DEFAULT_WIKI_WORD;
		}

		wikiWordTextField.setText(wikiWord);
		onSearch();
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return contentPane;
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer >>> IMPORTANT!! <<< DO NOT
	 * edit this method OR call it in your code!
	 * 
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
		final JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
		contentPane.add(panel1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK
				| GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
		final Spacer spacer1 = new Spacer();
		panel1.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
				GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
		final JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
		panel1.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK
				| GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
		buttonClose = new JButton();
		buttonClose.setText("Close");
		panel2.add(buttonClose, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
				GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
		wikiHelpButton = new JButton();
		wikiHelpButton.setText("Go to online Wiki");
		panel2.add(wikiHelpButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
				GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
		final JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
		contentPane
				.add(panel3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK
						| GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null,
						0, false));
		final JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
		panel3.add(panel4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK
				| GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
		wikiWordTextField = new JTextField();
		wikiWordTextField.setText("WikiWordHere");
		panel4.add(wikiWordTextField, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
				GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
		searchButton = new JButton();
		searchButton.setText("Search");
		panel4.add(searchButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
				GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
		final JScrollPane scrollPane1 = new JScrollPane();
		panel3.add(scrollPane1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK
				| GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0,
				false));
		helpEditorPane = new JEditorPane();
		helpEditorPane.setContentType("text/html");
		helpEditorPane.setEditable(false);
		helpEditorPane.setText("<html>\n  <head>\n    \n  </head>\n  <body>\n  </body>\n</html>\n");
		scrollPane1.setViewportView(helpEditorPane);
	}

	private String getNotFoundMessage(final String wikiWord) {
		String notFoundMessage = "<html>Cannot find <b>" + wikiWord + "</b><br>";
		notFoundMessage += "</html>";

		return notFoundMessage;
	}

	private void initUIs(final Window parent) {
		setContentPane(contentPane);
		setAlwaysOnTop(true);
		setTitle("Wiki Help");

		getRootPane().setDefaultButton(searchButton);
		wikiWordTextField.requestFocus();

		contentPane.registerKeyboardAction(new ActionListener() {

			public void actionPerformed(final ActionEvent e) {
				onClose();
			}
		}, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(final WindowEvent e) {
				onClose();
			}
		});

		buttonClose.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent e) {
				onClose();
			}
		});
		searchButton.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent event) {
				onSearch();
			}
		});

		wikiHelpButton.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent event) {
				onOnlineWiki();
			}
		});

		helpEditorPane.addHyperlinkListener(new HyperlinkListener() {

			public void hyperlinkUpdate(final HyperlinkEvent hyperlinkEvent) {
				if (hyperlinkEvent.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED)) {

					String app;
					String url = hyperlinkEvent.getURL().toString();

					try {
						if (System.getProperty("os.name").toLowerCase().contains("windows")) {
							app = "cmd.exe /c explorer " + url;
							Runtime.getRuntime().exec(app);
						} else {
							app = "open";
							String[] cmd = { app, url };
							Runtime.getRuntime().exec(cmd);
						}
					} catch (IOException e) {
						JOptionPane.showMessageDialog(CorelyzerApp.getApp().getMainFrame(), "Cannot open the link in your browser");
					}

					onClose();
				}
			}
		});

		pack();
		setSize(480, 640);
		setLocationRelativeTo(parent);
	}

	private void onClose() {
		dispose();
	}

	private void onOnlineWiki() {
		try {
			String app;
			String url = System.getProperty("corelyzer.helpurl");

			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				app = "cmd.exe /c explorer " + url;
				Runtime.getRuntime().exec(app);
			} else {
				app = "open";
				String[] cmd = { app, url };
				Runtime.getRuntime().exec(cmd);
			}
		} catch (IOException ex) {
			System.err.println("IOException in help button");
		}
	}

	private void onSearch() {
		String wikiWord = wikiWordTextField.getText();

		// search for <wikiWord>.html file
		File cwd = new File(".");
		String filePath = cwd.getAbsolutePath() + "/resources/help/" + wikiWord + ".html";
		File helpFile = new File(filePath);

		if (helpFile.exists()) {
			try {
				URL helpURL = helpFile.toURI().toURL();
				helpEditorPane.setPage(helpURL);

				repaint();

				return;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String mesg = getNotFoundMessage(wikiWord);
		helpEditorPane.setText(mesg);
	}
}