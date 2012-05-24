package picatcha;

import java.util.Properties;

public interface Picatcha {

    /*
     * Create Picatcha (HTML) embedded into the JSP powered webpage Available
     * customizations within Properties - Number of images with FORMAT Size of
     * each image with IMG_SIZE Amount of Noise with NOISE_LEVEL Type of Noise
     * with NOISE_TYPE Color Styling with STYLE Must create an object of
     * Properties and use setProperty to set desired values
     */
    public String createPicatchaHtml(Properties customizations);

    /*
     * Create Picatcha (HTML) embedded into JSP powered webpage Pass all
     * customization arguments null in each argument renders the default value
     * for the particular customization Example - null for imageSize will render
     * the HTML with 75px etc
     */
    public String createPicatchaHtml(String format, String imageSize,
            String noiseLevel, String noiseType, String style, String link);

    /*
     * Validate the user response by collecting IP Address, Client User-Agent,
     * Picatcha token and the user response Remember to set the Private Key
     * before making a call to this method
     */

    public String validatePicatchaHtml(String ip, String ua, String token,
            String[] response);

}
