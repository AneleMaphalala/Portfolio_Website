from setuptools import setup,find_packages

setup( 
    name="Portfolio Website",
    version="0.1",
    packages=find_packages(exclude=['tests*']),
    license="MIT",
    description="This is a personal portfolio website",
    long_description=open("README.md").read(),
    url="https://github.com/AneleMaphalala/Portfolio_Website.git",
    author="Anele Maphalala",
    author_email="maphalalaanele@gmail.com"
    )
   