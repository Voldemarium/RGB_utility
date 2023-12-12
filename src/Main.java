import functions.*;
import utils.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "./src/photo.jpg";
        final BufferedImage image =  ImageUtils.getImage(path);
        final  RgbMaster rgbMaster = new RgbMaster(image);
        ImageUtils imageUtilsJpg = new ImageUtils("jpg");
        imageUtilsJpg.saveImage(rgbMaster.changeImage(FilterOperation::greyScale), "./src/newPhoto1.jpg");
        imageUtilsJpg.saveImage(rgbMaster.changeImage(FilterOperation::onlyRed), "./src/newPhoto2.jpg");
        imageUtilsJpg.saveImage(rgbMaster.changeImage(FilterOperation::onlyGrey), "./src/newPhoto3.jpg");
        imageUtilsJpg.saveImage(rgbMaster.changeImage(FilterOperation::onlyBlue), "./src/newPhoto4.jpg");
        imageUtilsJpg.saveImage(rgbMaster.changeImage(FilterOperation::sepia), "./src/newPhoto5.jpg");
    }
}